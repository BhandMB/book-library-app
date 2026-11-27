# API request cancellation and stale response policy

## Problem
Rapid search/filter changes can let an older, slower response overwrite newer results.

## Client policy
- Associate each request with active query/filter state or a monotonically increasing sequence.
- Cancel superseded requests when supported.
- Before applying a response, verify it still belongs to active state.
- Distinguish cancellation from network failure; cancellation should not show an error toast.
- Tie loading state to the active request, not obsolete outstanding requests.

## Errors and retries
Retry only safe requests with bounded backoff. Preserve current results when refresh fails while indicating they may be stale. Avoid retry storms on repeated input changes.

## Tests
Simulate response-order inversion, cancellation, component unmount, rapid filter changes, timeout, and recovery. Stale responses must never replace the latest result set.
