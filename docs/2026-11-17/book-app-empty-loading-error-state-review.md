# Book App Loading, Empty, and Error State Review

## States to cover
- Initial loading and delayed response.
- Successful response with records.
- Successful response with no records.
- Recoverable network failure and server failure.
- Retry in progress and retry exhausted.

## UX requirements
Use clear, actionable messages; preserve relevant search or filter state; prevent duplicate submissions; and provide a retry action only when retry is safe.

## Verification
Test slow networks, offline mode, empty search results, and server errors at desktop and narrow viewport sizes. Check keyboard focus and accessible announcements.