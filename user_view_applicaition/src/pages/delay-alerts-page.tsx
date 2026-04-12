import { useState } from 'react';
import { useDelayAlerts } from '@/api/delay-alerts.api';
import { DelayAlertFilter } from '@/types/delay-alert';
import { DelayAlertFilterForm } from '@/components/delay-alert-filter-form';
import { DelayAlertTable } from '@/components/delay-alert-table';
import { PageLayout } from '@/components/page-layout';

const defaultFilter: DelayAlertFilter = {
  page: 0,
  size: 20,
};

export function DelayAlertsPage() {
  const [filter, setFilter] = useState<DelayAlertFilter>(defaultFilter);
  const { data, isLoading, error } = useDelayAlerts(filter);

  return (
    <PageLayout title="Delay Alerts" subtitle="Каркас страницы уведомлений о задержках">
      <DelayAlertFilterForm value={filter} onChange={setFilter} />
      {isLoading ? <p>Загрузка...</p> : null}
      {error ? <p>Ошибка загрузки уведомлений</p> : null}
      <DelayAlertTable items={data?.content ?? []} />
    </PageLayout>
  );
}
