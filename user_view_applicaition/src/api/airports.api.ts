import { useQuery } from '@tanstack/react-query';
import { PageResponse } from './types';
import { httpClient } from './http-client';
import { Airport, AirportFilter } from '@/types/airport';
import { normalizeFilter } from '@/lib/query';

export async function searchAirports(filter: AirportFilter): Promise<PageResponse<Airport>> {
  const { data } = await httpClient.post<PageResponse<Airport>>('/airports/search', normalizeFilter(filter));
  return data;
}

export function useAirports(filter: AirportFilter) {
  return useQuery({
    queryKey: ['airports', normalizeFilter(filter)],
    queryFn: () => searchAirports(filter),
  });
}
