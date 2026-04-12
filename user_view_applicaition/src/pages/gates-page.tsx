import { useState } from 'react';
import { useGates } from '@/api/gates.api';
import { GateFilter } from '@/types/gate';
import { GateFilterForm } from '@/components/gate-filter-form';
import { GateTable } from '@/components/gate-table';
import { PageLayout } from '@/components/page-layout';

const defaultFilter: GateFilter = {
  page: 0,
  size: 20,
};

export function GatesPage() {
  const [filter, setFilter] = useState<GateFilter>(defaultFilter);
  const { data, isLoading, error } = useGates(filter);

  return (
    <PageLayout title="Gates" subtitle="Каркас страницы гейтов">
      <GateFilterForm value={filter} onChange={setFilter} />
      {isLoading ? <p>Загрузка...</p> : null}
      {error ? <p>Ошибка загрузки гейтов</p> : null}
      <GateTable items={data?.content ?? []} />
    </PageLayout>
  );
}
