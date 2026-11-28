# Session expiry and unsaved work recovery

## User experience
When authentication expires during editing, explain what happened and protect recoverable user input without continuing unauthorized requests.

## Behavior
- Detect an authentication-expired response and transition the app to a signed-out state.
- Stop protected requests and clear sensitive in-memory data.
- Preserve only non-sensitive draft fields when product policy allows it.
- After reauthentication, let the user review and explicitly resubmit the draft.
- Never silently replay a mutation that may already have succeeded.

## Edge cases
Handle expiry during a save, multiple tabs, network loss during reauthentication, logout in another tab, and a changed resource version.

## Tests
Use deterministic expired-session responses and verify that drafts survive only as intended, no duplicate mutation occurs, and the user receives clear recovery instructions.
