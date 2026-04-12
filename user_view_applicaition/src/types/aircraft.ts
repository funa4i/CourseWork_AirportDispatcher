import { PageRequest } from '@/api/types';

export interface Aircraft {
  id: number;
  registrationNumber: string;
  serialNumber?: string;
  aircraftType?: string;
  companyId?: number;
}

export interface AircraftFilter extends PageRequest {
  id?: number;
  registrationNumber?: string;
  serialNumber?: string;
  aircraftType?: string;
  companyId?: number;
}
