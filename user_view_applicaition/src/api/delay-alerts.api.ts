import { useQuery } from '@tanstack/react-query';
import { PageResponse } from './types';
import { httpClient } from './http-client';
import { DelayAlert, DelayAlertFilter } from '@/types/delay-alert';
import { normalizeFilter } from '@/lib/query';

export async function searchDelayAlerts(filter: DelayAlertFilter): Promise<PageResponse<DelayAlert>> {
  const { data } = await httpClient.post<PageResponse<DelayAlert>>('/delay-alerts/search', normalizeFilter(filter));
  return data;
}

export function useDelayAlerts(filter: DelayAlertFilter) {
  return useQuery({
    queryKey: ['delay-alerts', normalizeFilter(filter)],
    queryFn: () => searchDelayAlerts(filter),
  });
}
