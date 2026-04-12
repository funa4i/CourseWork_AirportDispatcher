import { PageRequest } from '@/api/types';

export interface Airport {
  id: number;
  name: string;
  iataCode?: string;
  icaoCode?: string;
  city?: string;
  country?: string;
}

export interface AirportFilter extends PageRequest {
  id?: number;
  name?: string;
  iataCode?: string;
  icaoCode?: string;
  city?: string;
  country?: string;
}
