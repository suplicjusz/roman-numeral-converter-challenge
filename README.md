## About this project

This is a clean and modular Java console application that converts Roman numerals (I–MMMCMXCIX) to Arabic numbers.  
It was built to demonstrate:

- solid **software architecture** principles,
- proper use of **design patterns** (`Facade`, with extensibility for `Strategy`),
- **regex-based validation** of Roman numeral input,
- and a user-friendly **REPL interface** (Read–Eval–Print Loop).

The application is designed to support **multiple interchangeable conversion algorithms**.  
Thanks to the use of the `RomanConverter` interface and the Strategy design principle, it is easy to add and plug in new implementations (e.g. tokenizer-based, recursive, regex-replacement-based, etc.) without modifying the existing logic.

The current implementation uses a map-based approach for fast and reliable conversion. Future versions may include alternative strategies for educational or benchmarking purposes.
