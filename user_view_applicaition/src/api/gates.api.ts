import { useQuery } from '@tanstack/react-query';
import { PageResponse } from './types';
import { httpClient } from './http-client';
import { Gate, GateFilter } from '@/types/gate';
import { normalizeFilter } from '@/lib/query';

export async function searchGates(filter: GateFilter): Promise<PageResponse<Gate>> {
  const { data } = await httpClient.post<PageResponse<Gate>>('/gates/search', normalizeFilter(filter));
  return data;
}

export function useGates(filter: GateFilter) {
  return useQuery({
    queryKey: ['gates', normalizeFilter(filter)],
    queryFn: () => searchGates(filter),
  });
}
