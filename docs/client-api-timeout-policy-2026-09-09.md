# Client API Timeout Policy

When a request exceeds the client timeout:

- Show a retryable message rather than treating the response as an empty result.
- Preserve user-entered search or form values.
- Prevent duplicate submissions while the retry is in progress.
- Record enough context for debugging without exposing credentials.
- Use bounded retries with backoff only for safe, idempotent reads.

Document endpoint-specific exceptions before adding automatic retries to writes.