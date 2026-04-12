import { useQuery } from '@tanstack/react-query';
import { PageResponse } from './types';
import { httpClient } from './http-client';
import { Flight, FlightFilter } from '@/types/flight';
import { normalizeFilter } from '@/lib/query';

export async function getFlightById(id: number): Promise<Flight> {
  const { data } = await httpClient.get<Flight>(`/flights/${id}`);
  return data;
}

export async function searchFlights(filter: FlightFilter): Promise<PageResponse<Flight>> {
  const { data } = await httpClient.post<PageResponse<Flight>>('/flights/search', normalizeFilter(filter));
  return data;
}

export function useFlights(filter: FlightFilter) {
  return useQuery({
    queryKey: ['flights', normalizeFilter(filter)],
    queryFn: () => searchFlights(filter),
  });
}
