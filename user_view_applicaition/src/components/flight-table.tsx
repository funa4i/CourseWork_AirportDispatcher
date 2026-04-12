import { SimpleTable } from './simple-table';
import { Flight } from '@/types/flight';
import { formatDateTime } from '@/lib/date';

interface FlightTableProps {
  items: Flight[];
}

export function FlightTable({ items }: FlightTableProps) {
  return (
    <SimpleTable
      items={items}
      columns={[
        { key: 'id', title: 'ID', render: (item) => item.id },
        { key: 'flightNumber', title: 'Номер', render: (item) => item.flightNumber },
        { key: 'type', title: 'Тип', render: (item) => item.flightType },
        { key: 'status', title: 'Статус', render: (item) => item.status ?? '—' },
        { key: 'scheduledAt', title: 'По расписанию', render: (item) => formatDateTime(item.scheduledAt) },
        { key: 'actualAt', title: 'Фактически', render: (item) => formatDateTime(item.actualAt) },
      ]}
    />
  );
}
