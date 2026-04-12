export function getLabelByValue<T extends string | number>(
  dictionary: Record<T, string>,
  value?: T | null,
  fallback = '—',
): string {
  if (value === undefined || value === null) {
    return fallback;
  }

  return dictionary[value] ?? fallback;
}
