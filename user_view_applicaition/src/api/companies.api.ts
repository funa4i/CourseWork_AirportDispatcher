import { useQuery } from '@tanstack/react-query';
import { PageResponse } from './types';
import { httpClient } from './http-client';
import { Company, CompanyFilter } from '@/types/company';
import { normalizeFilter } from '@/lib/query';

export async function searchCompanies(filter: CompanyFilter): Promise<PageResponse<Company>> {
  const { data } = await httpClient.post<PageResponse<Company>>('/companies/search', normalizeFilter(filter));
  return data;
}

export function useCompanies(filter: CompanyFilter) {
  return useQuery({
    queryKey: ['companies', normalizeFilter(filter)],
    queryFn: () => searchCompanies(filter),
  });
}
