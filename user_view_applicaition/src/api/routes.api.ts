import { useQuery } from '@tanstack/react-query';
import { PageResponse } from './types';
import { httpClient } from './http-client';
import { Route, RouteFilter } from '@/types/route';
import { normalizeFilter } from '@/lib/query';

export async function searchRoutes(filter: RouteFilter): Promise<PageResponse<Route>> {
  const { data } = await httpClient.post<PageResponse<Route>>('/routes/search', normalizeFilter(filter));
  return data;
}

export function useRoutes(filter: RouteFilter) {
  return useQuery({
    queryKey: ['routes', normalizeFilter(filter)],
    queryFn: () => searchRoutes(filter),
  });
}
