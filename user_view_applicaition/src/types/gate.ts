import { PageRequest } from '@/api/types';

export interface Gate {
  id: number;
  gateNumber: string;
  terminal?: string;
  status?: string;
}

export interface GateFilter extends PageRequest {
  id?: number;
  gateNumber?: string;
  terminal?: string;
  status?: string;
}
