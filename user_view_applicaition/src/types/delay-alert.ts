import { PageRequest } from '@/api/types';

export interface DelayAlert {
  id: number;
  flightId: number;
  delayMinutes: number;
  reason?: string;
  createdAt?: string;
  severity?: string;
}

export interface DelayAlertFilter extends PageRequest {
  id?: number;
  flightId?: number;
  minDelayMinutes?: number;
  maxDelayMinutes?: number;
  reason?: string;
  severity?: string;
}
