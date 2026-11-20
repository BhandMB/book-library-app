# Book App: API Timeout and Retry UX

Date: 2026-11-20

## Goal

Help users recover from temporary network failures without duplicate actions or lost form input.

## UI behavior

- Distinguish loading, empty, offline, timeout, and server-error states.
- Preserve search terms and form values when a request fails.
- Provide a clear retry action for transient failures.
- Prevent repeated taps from launching duplicate submissions.
- Show a useful message without exposing raw server diagnostics.

## Retry policy

Use bounded retries with backoff only for safe, transient operations. Do not automatically retry a non-idempotent create request unless the API provides an idempotency mechanism. Cancel or ignore stale search responses so older results cannot overwrite newer ones.

## Verification

- [ ] Timeout state is visible and recoverable.
- [ ] Form input survives a failed request.
- [ ] Duplicate submission is prevented.
- [ ] Stale search responses are ignored.
- [ ] Retry behavior is bounded and documented.

## Scope

Frontend behavior specification only; no live API behavior was tested.