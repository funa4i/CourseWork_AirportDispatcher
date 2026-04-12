import { PageRequest } from '@/api/types';
import { FlightType } from './flight';

export interface Route {
  id: number;
  externalAirportId: number;
  aircraftId?: number;
  flightType: FlightType;
}

export interface RouteFilter extends PageRequest {
  id?: number;
  externalAirportId?: number;
  aircraftId?: number;
  flightType?: FlightType;
}
