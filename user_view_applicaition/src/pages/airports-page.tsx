import { useState } from 'react';
import { useAirports } from '@/api/airports.api';
import { AirportFilter } from '@/types/airport';
import { AirportFilterForm } from '@/components/airport-filter-form';
import { AirportTable } from '@/components/airport-table';
import { PageLayout } from '@/components/page-layout';

const defaultFilter: AirportFilter = {
  page: 0,
  size: 20,
};

export function AirportsPage() {
  const [filter, setFilter] = useState<AirportFilter>(defaultFilter);
  const { data, isLoading, error } = useAirports(filter);

  return (
    <PageLayout title="Airports" subtitle="Каркас страницы аэропортов">
      <AirportFilterForm value={filter} onChange={setFilter} />
      {isLoading ? <p>Загрузка...</p> : null}
      {error ? <p>Ошибка загрузки аэропортов</p> : null}
      <AirportTable items={data?.content ?? []} />
    </PageLayout>
  );
}
