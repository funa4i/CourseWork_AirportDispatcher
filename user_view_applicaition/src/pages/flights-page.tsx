import { useState } from 'react';
import { useFlights } from '@/api/flights.api';
import { FlightFilter } from '@/types/flight';
import { FlightFilterForm } from '@/components/flight-filter-form';
import { FlightTable } from '@/components/flight-table';
import { PageLayout } from '@/components/page-layout';

const defaultFilter: FlightFilter = {
  page: 0,
  size: 20,
};

export function FlightsPage() {
  const [filter, setFilter] = useState<FlightFilter>(defaultFilter);
  const { data, isLoading, error } = useFlights(filter);

  return (
    <PageLayout title="Flights" subtitle="Каркас страницы рейсов для class diagram">
      <FlightFilterForm value={filter} onChange={setFilter} />
      {isLoading ? <p>Загрузка...</p> : null}
      {error ? <p>Ошибка загрузки рейсов</p> : null}
      <FlightTable items={data?.content ?? []} />
    </PageLayout>
  );
}
