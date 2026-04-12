import { PageRequest } from '@/api/types';

export interface DateRange {
  from?: string;
  to?: string;
}

export interface SelectOption<T = number | string> {
  value: T;
  label: string;
}

export interface BaseFilter extends PageRequest {
  id?: number;
  name?: string;
}
