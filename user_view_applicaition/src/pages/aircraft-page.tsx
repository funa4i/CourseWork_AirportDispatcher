import { useState } from 'react';
import { useAircraft } from '@/api/aircraft.api';
import { AircraftFilter } from '@/types/aircraft';
import { AircraftFilterForm } from '@/components/aircraft-filter-form';
import { AircraftTable } from '@/components/aircraft-table';
import { PageLayout } from '@/components/page-layout';

const defaultFilter: AircraftFilter = {
  page: 0,
  size: 20,
};

export function AircraftPage() {
  const [filter, setFilter] = useState<AircraftFilter>(defaultFilter);
  const { data, isLoading, error } = useAircraft(filter);

  return (
    <PageLayout title="Aircraft" subtitle="Каркас страницы самолётов">
      <AircraftFilterForm value={filter} onChange={setFilter} />
      {isLoading ? <p>Загрузка...</p> : null}
      {error ? <p>Ошибка загрузки самолётов</p> : null}
      <AircraftTable items={data?.content ?? []} />
    </PageLayout>
  );
}
