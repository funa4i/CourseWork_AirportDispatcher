import { DateRange } from './common';
import { PageRequest } from '@/api/types';

export type FlightType = 'ARRIVAL' | 'DEPARTURE';
export type FlightStatus = 'SCHEDULED' | 'BOARDING' | 'DEPARTED' | 'ARRIVED' | 'DELAYED' | 'CANCELLED';

export interface Flight {
  id: number;
  flightNumber: string;
  companyId?: number;
  routeId?: number;
  aircraftId?: number;
  gateId?: number;
  scheduledAt?: string;
  actualAt?: string;
  flightType: FlightType;
  status?: FlightStatus | string;
}

export interface FlightFilter extends PageRequest {
  id?: number;
  flightNumber?: string;
  companyId?: number;
  routeId?: number;
  aircraftId?: number;
  gateId?: number;
  flightType?: FlightType;
  status?: FlightStatus | string;
  scheduledRange?: DateRange;
  actualRange?: DateRange;
}
