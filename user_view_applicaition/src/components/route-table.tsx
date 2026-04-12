import { Route } from '@/types/route';
import { SimpleTable } from './simple-table';

export function RouteTable({ items }: { items: Route[] }) {
  return (
    <SimpleTable
      items={items}
      columns={[
        { key: 'id', title: 'ID', render: (item) => item.id },
        { key: 'externalAirportId', title: 'Внешний аэропорт', render: (item) => item.externalAirportId },
        { key: 'aircraftId', title: 'Самолёт', render: (item) => item.aircraftId ?? '—' },
        { key: 'flightType', title: 'Направление', render: (item) => item.flightType },
      ]}
    />
  );
}
