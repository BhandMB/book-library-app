# Frontend API Error Recovery Matrix

**Date:** 2026-10-27  
**Purpose:** Make network and API failures predictable for users.

| Failure | User-facing behavior | Recovery path |
|---|---|---|
| Offline/network unavailable | Explain that the server could not be reached | Retry when connectivity returns |
| Request timeout | Show a concise timeout message | Offer retry; avoid automatic repeated writes |
| `400` validation error | Show field-level details where available | Correct the submitted fields |
| `401` unauthenticated | Explain that sign-in is required | Re-authenticate and retry the intended action |
| `403` forbidden | Explain that the action is not permitted | Return to a permitted view; do not loop retries |
| `404` missing resource | Show a not-found state | Navigate back to the list or search again |
| `409` conflict | Explain that the data changed or conflicts | Refresh and resolve before resubmitting |
| `5xx` server failure | Show a generic service error | Retry safe reads; avoid duplicate non-idempotent writes |

## Implementation notes

- Keep technical diagnostics in development logs, not user-facing text.
- Preserve the original request context when retry is safe.
- Disable or guard repeated submissions while a request is in flight.
- Distinguish empty data from failed data loading.
- Test timeout, malformed response, and unmount/navigation during a pending request.