# Book App API Retry Behavior

## Retry policy
Retry only transient failures that are safe to repeat. Use bounded attempts and backoff, and avoid retrying validation, authorization, or other permanent client errors.

## Write operations
Do not automatically replay non-idempotent requests unless the API provides an idempotency mechanism. Keep the user informed when an operation's outcome is uncertain.

## Verification
Simulate timeouts, server errors, offline transitions, and duplicate responses. Confirm that retries do not create duplicate books or hide a final failure.