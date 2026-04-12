import { ChangeEvent } from 'react';
import { DelayAlertFilter } from '@/types/delay-alert';

export function DelayAlertFilterForm({ value, onChange }: { value: DelayAlertFilter; onChange: (next: DelayAlertFilter) => void }) {
  function handleInputChange(event: ChangeEvent<HTMLInputElement>) {
    const { name, value: fieldValue } = event.target;
    onChange({ ...value, [name]: fieldValue || undefined, page: 0 });
  }

  return (
    <div style={{ display: 'grid', gap: 8, gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', marginBottom: 16 }}>
      <input name="flightId" placeholder="ID рейса" value={value.flightId ?? ''} onChange={handleInputChange} />
      <input name="minDelayMinutes" placeholder="Мин. задержка" value={value.minDelayMinutes ?? ''} onChange={handleInputChange} />
      <input name="maxDelayMinutes" placeholder="Макс. задержка" value={value.maxDelayMinutes ?? ''} onChange={handleInputChange} />
      <input name="severity" placeholder="Критичность" value={value.severity ?? ''} onChange={handleInputChange} />
    </div>
  );
}
