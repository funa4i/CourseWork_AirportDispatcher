import { PageRequest } from '@/api/types';

export interface Company {
  id: number;
  name: string;
  iataCode?: string;
  icaoCode?: string;
  digitalCode?: string;
  tcldCode?: string;
}

export interface CompanyFilter extends PageRequest {
  id?: number;
  name?: string;
  iataCode?: string;
  icaoCode?: string;
  digitalCode?: string;
  tcldCode?: string;
}
