# Shared layer

Базовый инфраструктурный слой для React-приложения.

Содержимое:
- `src/shared/api/http-client.ts` — общий axios-клиент
- `src/shared/api/types.ts` — общие типы API, пагинации и ошибок
- `src/shared/lib/query.ts` — утилиты для react-query и фильтров
- `src/shared/lib/date.ts` — форматирование дат
- `src/shared/lib/dictionary.ts` — отображение enum/словарей
- `src/shared/index.ts` — barrel export

Замечание:
В `query.ts` используются alias-импорты вида `@/shared/...`.
Для Vite/TS нужно настроить path alias `@ -> src`.
