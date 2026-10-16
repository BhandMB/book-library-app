# Frontend Environment Setup

## Setup checklist
- [ ] Confirm the supported runtime and package manager from the project manifest and lockfile.
- [ ] Install dependencies using the package manager appropriate to the repository.
- [ ] Copy the example environment file if one is provided; do not commit local secrets.
- [ ] Configure the API base URL for local development.
- [ ] Start the API service or confirm the configured remote API is reachable.
- [ ] Run the documented development command.
- [ ] Run linting, tests, and the production build commands available in the project.

## Troubleshooting
- Check the terminal output for dependency or configuration errors.
- Confirm API URL, port, and CORS settings agree between frontend and backend.
- Restart the development server after changing environment variables when required.
- Do not publish credentials or private environment files in issue reports.

Update this guide when scripts, runtime requirements, or configuration variables change.