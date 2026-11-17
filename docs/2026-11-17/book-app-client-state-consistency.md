# Book App Client State Consistency

## Risks
Stale cached data, overlapping requests, and navigation during an in-flight mutation can leave the interface inconsistent with the server.

## Rules
- Associate responses with the request that initiated them.
- Prevent older search responses from replacing newer results.
- Invalidate or refresh affected views after successful writes.
- Show pending, success, and failure states without optimistic claims that a write completed.
- Define behavior when a user navigates away during a mutation.

## Test scenarios
Issue rapid searches, update a record while a list is visible, simulate out-of-order responses, and interrupt a request. Confirm the final UI matches persisted server state.