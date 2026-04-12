import { ChangeEvent } from 'react';
import { GateFilter } from '@/types/gate';

export function GateFilterForm({ value, onChange }: { value: GateFilter; onChange: (next: GateFilter) => void }) {
  function handleInputChange(event: ChangeEvent<HTMLInputElement>) {
    const { name, value: fieldValue } = event.target;
    onChange({ ...value, [name]: fieldValue || undefined, page: 0 });
  }

  return (
    <div style={{ display: 'grid', gap: 8, gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', marginBottom: 16 }}>
      <input name="gateNumber" placeholder="Номер гейта" value={value.gateNumber ?? ''} onChange={handleInputChange} />
      <input name="terminal" placeholder="Терминал" value={value.terminal ?? ''} onChange={handleInputChange} />
      <input name="status" placeholder="Статус" value={value.status ?? ''} onChange={handleInputChange} />
    </div>
  );
}
