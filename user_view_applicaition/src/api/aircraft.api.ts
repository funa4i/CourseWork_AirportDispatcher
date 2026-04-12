import { useQuery } from '@tanstack/react-query';
import { PageResponse } from './types';
import { httpClient } from './http-client';
import { Aircraft, AircraftFilter } from '@/types/aircraft';
import { normalizeFilter } from '@/lib/query';

export async function searchAircraft(filter: AircraftFilter): Promise<PageResponse<Aircraft>> {
  const { data } = await httpClient.post<PageResponse<Aircraft>>('/aircraft/search', normalizeFilter(filter));
  return data;
}

export function useAircraft(filter: AircraftFilter) {
  return useQuery({
    queryKey: ['aircraft', normalizeFilter(filter)],
    queryFn: () => searchAircraft(filter),
  });
}
