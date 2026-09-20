# LogisticsFactory

## Project Purpose

This project demonstrates two creational design patterns in Java: **Factory Method** and **Abstract Factory**.

The Factory Method pattern is used to create different transport types for road and sea delivery. The Abstract Factory pattern is used to create compatible GUI components for Windows and macOS.

Both patterns are integrated into one application, allowing the delivery mode and GUI platform to be selected independently at runtime.

## Project Structure

- `factorymethod` — contains the Factory Method implementation:
    - `Transport`
    - `Truck`
    - `Ship`
    - `Logistics`
    - `RoadLogistics`
    - `SeaLogistics`

- `abstractfactory` — contains the Abstract Factory implementation:
    - `Button`
    - `Checkbox`
    - `WindowsButton`
    - `WindowsCheckbox`
    - `MacOSButton`
    - `MacOSCheckbox`
    - `GUIFactory`
    - `WindowsFactory`
    - `MacOSFactory`
    - `Application`
    - `Main`

## Prerequisites

- JDK 17
- IntelliJ IDEA or another Java IDE

## How to Run

1. Open the project.
2. Make sure JDK 17 is selected.
3. Run `abstractfactory.Main`.
4. Provide four program arguments in the following order:

```text
<ROAD|SEA> <WINDOWS|MACOS> <cargo> <destination>
```

Example:

```text
ROAD WINDOWS "Medical equipment" Karaganda
```

## Supported Input Values

Delivery modes:

- `ROAD` — uses Truck
- `SEA` — uses Ship

GUI platforms:

- `WINDOWS` — creates Windows Button and Checkbox
- `MACOS` — creates macOS Button and Checkbox

The application also handles unsupported delivery modes, unsupported platforms, and missing input.

## Sample Run

Input:

```text
ROAD WINDOWS "Medical equipment" Karaganda
```

Output:

```text
Rendering a Windows button.
Rendering a Windows checkbox.
Delivering "Medical equipment" to "Karaganda" by Truck.
```

## Design Patterns

### Factory Method

`Logistics` defines the common delivery workflow and the `createTransport()` factory method. `RoadLogistics` creates a `Truck`, while `SeaLogistics` creates a `Ship`.

### Abstract Factory

`GUIFactory` defines methods for creating `Button` and `Checkbox` objects. `WindowsFactory` creates Windows components, while `MacOSFactory` creates macOS components. The `Application` class works with these abstractions instead of concrete GUI products.