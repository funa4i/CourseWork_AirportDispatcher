import { Gate } from '@/types/gate';
import { SimpleTable } from './simple-table';

export function GateTable({ items }: { items: Gate[] }) {
  return (
    <SimpleTable
      items={items}
      columns={[
        { key: 'id', title: 'ID', render: (item) => item.id },
        { key: 'gateNumber', title: 'Гейт', render: (item) => item.gateNumber },
        { key: 'terminal', title: 'Терминал', render: (item) => item.terminal ?? '—' },
        { key: 'status', title: 'Статус', render: (item) => item.status ?? '—' },
      ]}
    />
  );
}
