# Contributing to Simple Ecommerce Store

Thank you for your interest in contributing to the Simple Ecommerce Store project! This document provides guidelines and instructions for contributing.

## Code of Conduct

Be respectful, inclusive, and professional. We're committed to providing a welcoming environment for all contributors.

## Getting Started

1. **Fork the repository**
   ```bash
   git clone https://github.com/YOUR_USERNAME/simple-ecommerce-store.git
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Set up your development environment**
   ```bash
   mvn clean install
   ```

## Development Guidelines

### Code Style
- Follow Google Java Style Guide
- Use meaningful variable and method names
- Keep methods small and focused
- Add comments for complex logic

### Testing
- Write unit tests for all new features
- Maintain test coverage above 80%
- All tests must pass before submitting PR
- ```bash
  mvn test
  ```

### Commit Messages
- Use clear, descriptive commit messages
- Start with a verb: "Add", "Fix", "Improve", "Refactor"
- Reference issue numbers when applicable
- Example: `Add user authentication endpoint (#123)`

### Pull Request Process

1. **Update documentation**
   - Update README.md if needed
   - Add API documentation for new endpoints
   - Update Swagger annotations

2. **Test thoroughly**
   ```bash
   mvn clean test
   ```

3. **Create a descriptive PR**
   - Clear title and description
   - Link related issues
   - Add screenshots/examples if applicable

4. **Code Review**
   - Address reviewer feedback promptly
   - Be open to suggestions
   - Discuss disagreements respectfully

## Feature Request Process

1. Check existing issues to avoid duplicates
2. Create a new GitHub issue with:
   - Clear title
   - Detailed description
   - Use cases and benefits
   - Proposed implementation (if applicable)

## Bug Report Process

1. Check existing issues
2. Create a new GitHub issue with:
   - Clear title
   - Step-by-step reproduction
   - Expected vs actual behavior
   - Environment details (OS, Java version, etc.)
   - Error logs

## Documentation

- Update README.md for new features
- Add JavaDoc comments to public methods
- Update Swagger annotations
- Add examples to documentation

## Building and Testing

```bash
# Build the project
mvn clean install -DskipTests

# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=AuthControllerTest

# Generate coverage report
mvn clean test jacoco:report
```

## Branch Naming Convention

- `feature/description` - New features
- `bugfix/description` - Bug fixes
- `improve/description` - Improvements
- `docs/description` - Documentation updates
- `refactor/description` - Code refactoring

## Release Process

1. Version follows Semantic Versioning (MAJOR.MINOR.PATCH)
2. Update version in pom.xml
3. Update CHANGELOG.md
4. Create release notes
5. Tag release in Git

## Questions or Need Help?

- Create an issue for bugs
- Start a discussion for questions
- Email: roshanchitrang9307@gmail.com

## License

By contributing, you agree that your contributions will be licensed under the MIT License.

---

Thank you for contributing to make this project better! 🚀
