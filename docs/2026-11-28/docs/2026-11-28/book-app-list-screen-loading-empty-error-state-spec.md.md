# List screen loading, empty, and error state specification

## States
Define initial loading, refresh loading, populated, filtered-empty, truly-empty, recoverable error, and terminal error states. Avoid using one generic empty message for every condition.

## Behavior
- Keep existing results visible during a background refresh where safe.
- Distinguish no books available from no matches for the current filters.
- Provide a retry action for recoverable failures.
- Preserve search and filter values after a failed request.
- Prevent stale responses from replacing current state.
- Announce meaningful state changes to assistive technology.

## Acceptance checks
Test first load, slow response, zero records, no filter matches, timeout, server error, retry success, refresh failure with cached results, and keyboard navigation. Verify messages explain the next useful action.
