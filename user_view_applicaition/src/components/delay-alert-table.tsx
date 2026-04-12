import { DelayAlert } from '@/types/delay-alert';
import { SimpleTable } from './simple-table';
import { formatDateTime } from '@/lib/date';

export function DelayAlertTable({ items }: { items: DelayAlert[] }) {
  return (
    <SimpleTable
      items={items}
      columns={[
        { key: 'id', title: 'ID', render: (item) => item.id },
        { key: 'flightId', title: 'Рейс', render: (item) => item.flightId },
        { key: 'delayMinutes', title: 'Задержка, мин', render: (item) => item.delayMinutes },
        { key: 'severity', title: 'Критичность', render: (item) => item.severity ?? '—' },
        { key: 'createdAt', title: 'Создано', render: (item) => formatDateTime(item.createdAt) },
      ]}
    />
  );
}
