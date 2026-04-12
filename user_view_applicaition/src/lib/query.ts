export function normalizeFilter<T extends object>(filter: T): Partial<T> {
    return Object.fromEntries(
        Object.entries(filter).filter(([_, value]) => {
            if (value === undefined || value === null) return false;
            if (typeof value === 'string') return value.trim().length > 0;
            if (Array.isArray(value)) return value.length > 0;
            return true;
        }),
    ) as Partial<T>;
}