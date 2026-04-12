import { useState } from 'react';
import { useRoutes } from '@/api/routes.api';
import { RouteFilter } from '@/types/route';
import { RouteFilterForm } from '@/components/route-filter-form';
import { RouteTable } from '@/components/route-table';
import { PageLayout } from '@/components/page-layout';

const defaultFilter: RouteFilter = {
  page: 0,
  size: 20,
};

export function RoutesPage() {
  const [filter, setFilter] = useState<RouteFilter>(defaultFilter);
  const { data, isLoading, error } = useRoutes(filter);

  return (
    <PageLayout title="Routes" subtitle="Каркас страницы маршрутов">
      <RouteFilterForm value={filter} onChange={setFilter} />
      {isLoading ? <p>Загрузка...</p> : null}
      {error ? <p>Ошибка загрузки маршрутов</p> : null}
      <RouteTable items={data?.content ?? []} />
    </PageLayout>
  );
}
