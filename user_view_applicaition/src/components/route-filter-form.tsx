import { ChangeEvent } from 'react';
import { RouteFilter } from '@/types/route';

export function RouteFilterForm({ value, onChange }: { value: RouteFilter; onChange: (next: RouteFilter) => void }) {
  function handleInputChange(event: ChangeEvent<HTMLInputElement | HTMLSelectElement>) {
    const { name, value: fieldValue } = event.target;
    onChange({ ...value, [name]: fieldValue || undefined, page: 0 });
  }

  return (
    <div style={{ display: 'grid', gap: 8, gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', marginBottom: 16 }}>
      <input name="externalAirportId" placeholder="ID внешнего аэропорта" value={value.externalAirportId ?? ''} onChange={handleInputChange} />
      <input name="aircraftId" placeholder="ID самолёта" value={value.aircraftId ?? ''} onChange={handleInputChange} />
      <select name="flightType" value={value.flightType ?? ''} onChange={handleInputChange}>
        <option value="">Все направления</option>
        <option value="ARRIVAL">Прилёт</option>
        <option value="DEPARTURE">Вылет</option>
      </select>
    </div>
  );
}
