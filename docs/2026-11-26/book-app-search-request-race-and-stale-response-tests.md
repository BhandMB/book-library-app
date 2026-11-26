# Book Library App Search Request Race and Stale Response Tests

## Objective
Prevent older search responses from overwriting results for a newer query.

## Typical failure
A user enters query A, quickly changes to query B, and the slower response for A arrives after B. Without request coordination, the UI may display results that do not match the current input.

## Expected behavior
- Associate each request with the query or a monotonically increasing request identifier.
- Apply a response only if it still belongs to the current query state.
- Cancel obsolete requests when supported.
- Keep loading, empty, error, and result states mutually consistent.
- Avoid showing stale results as if they belong to the latest query.

## Test scenarios
- Slow response A followed by fast response B.
- Query cleared while a request is pending.
- Component unmount during a request.
- Network failure for the latest query.
- Retry after failure.
- Filter change while text search is pending.

## UX considerations
Debounce rapid input where appropriate, but do not rely on debounce alone to solve response ordering. Preserve keyboard usability and announce updated result counts accessibly.
