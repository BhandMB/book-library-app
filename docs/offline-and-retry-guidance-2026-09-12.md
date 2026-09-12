# Offline and Retry Guidance

## Client behavior
- Show a clear state when the network is unavailable.
- Retry only idempotent reads automatically.
- Avoid duplicate submissions for create or update actions.
- Preserve the user's input when a request fails.
- Provide a manual retry action with useful feedback.
