# Book Library App Access Token Storage Threat Review

## Goal
Review client-side token handling and reduce exposure from browser-based attacks and accidental leakage.

## Threats
- Cross-site scripting reading tokens from script-accessible storage
- Tokens appearing in URLs, logs, crash reports, or analytics
- Stale tokens remaining after logout
- Refresh tokens being exposed to untrusted browser contexts
- Multiple tabs retaining inconsistent authentication state

## Preferred controls
Where supported by the backend architecture, prefer secure, HttpOnly, SameSite cookies with appropriate CSRF protection. If bearer tokens must be stored client-side, document the threat trade-off, keep lifetimes short, and avoid placing long-lived refresh tokens in local storage.

## Client requirements
Clear authentication state on logout and terminal authentication failure. Never log token values. Restrict third-party scripts and apply a strong content security policy where applicable. Ensure API errors do not echo credentials.

## Verification
Inspect browser storage, network requests, console output, analytics payloads, and logout behavior. Test expired-token handling and multi-tab sign-out synchronization.

## Release gate
Do not claim the application is secure based solely on hiding tokens in the UI; validate the actual storage and transport behavior.
