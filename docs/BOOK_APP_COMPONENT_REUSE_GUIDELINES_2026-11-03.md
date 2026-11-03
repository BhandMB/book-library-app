# Book Library App Component Reuse Guidelines

Date: 2026-11-03

## Reuse principles
- Keep repeated visual patterns in shared components.
- Keep data fetching and domain decisions outside purely presentational components.
- Use consistent names and prop types.
- Prefer explicit loading, empty, error, and success states.
- Keep components focused and avoid large components that mix unrelated responsibilities.

## Design consistency
Use shared tokens or theme variables for spacing, typography, colors, borders, and focus styles. Avoid one-off values when an existing design token expresses the same intent.

## Change safety
Before extracting a component, identify all call sites and preserve behavior. Add or update tests for variants and accessibility states. Avoid abstraction when it makes a simple one-off component harder to understand.

## Review checklist
Check naming, prop clarity, keyboard behavior, responsive layout, and whether the abstraction genuinely reduces duplication.