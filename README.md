
# Java Sorting and Searching Program

This program reads a CSV file, sorts the data, or performs a search operation based on the provided command-line arguments. The program supports sorting by ID, first name, or last name and searching for a specific term within the file.

---

## Features

1. **Sort by ID** (`-n`): Sorts the data by ID.
2. **Sort by First Name** (`-f`): Sorts the data by the first name.
3. **Sort by Last Name** (`-l`): Sorts the data by the last name.
4. **Search by Term** (`-s <term>`): Searches for a specific term in the file.

---

## Prerequisites

1. Java JDK (version 8 or later).
2. A CSV file containing the data to be processed.

---

## Usage

To compile and run the program, follow these steps:

1. **Compile the Code**  
   ```bash
   javac Main.java
   ```

2. **Run the Program**  
   ```bash
   java Main <command> <input_file> [search_term]
   ```

   - `<input_file>`: The path to the CSV file.
   - `<command>`: The action to perform (`-n`, `-f`, `-l`, or `-s`).
   - `[search_term]`: Required only for the `-s` command.

---

### Command Details

| Command  | Description                               | Example Usage                           |
|----------|-------------------------------------------|-----------------------------------------|
| `-n`     | Sorts the file by ID                      | `java Main data.csv -n`                 |
| `-f`     | Sorts the file by the first name          | `java Main data.csv -f`                 |
| `-l`     | Sorts the file by the last name           | `java Main data.csv -l`                 |
| `-s`     | Searches for a specific term in the file  | `java Main data.csv -s John`            |

---

## Error Handling

1. **Insufficient Arguments**: If the program is run without enough arguments, it will display:
   ```
   Error: Insufficient arguments. Please provide an input file and a command.
   ```

2. **File Not Found**: If the specified file does not exist, it will display:
   ```
   Error: The file was not found. Please check the path and try again.
   ```

3. **Invalid Command**: If an unsupported command is entered, it will display:
   ```
   Invalid command. Please try again.
   ```

4. **Missing Search Term**: If the `-s` command is used without providing a search term, it will display:
   ```
   Error: No search term provided. Please provide a search term.
   ```

---

## Notes

- Ensure the input CSV file is correctly formatted.
- The `Sort` and `search` classes should be implemented to handle sorting and searching logic. Ensure they provide the following methods:
  - `readCSV()`: Reads the CSV file.
  - `SortID()`: Sorts data by ID.
  - `Sortfirst()`: Sorts data by the first name.
  - `Sortlast()`: Sorts data by the last name.
  - `display()`: Displays search results.

---

# Example

# Sorting by First Name
```bash
java Main -f class.csv
```
## Example output
```
672115049 ANAWAT JANDEE
672115007 CHANCHAKORN JULLAPECH
672115006 CHANLACHAT PANYOYAI
672115008 CHANYA BUNRUEANG
672115005 CHETSADA KANKARN
672115009 CHIDNUCHA POBKEEREE
662115007 CHONCHANUN KHACHONPHURITHANAKUL
672115018 DALANPHOP KEAWSIRIPONG
672115004 JITTIPAT KAEWIJIT
672115001 KATIKA KANTHASON
672115002 KRITTAMETH TANSUWAN
662115039 MANAPAT KAEWLAI
672115039 METAVEE AEINJANG
672115010 NATANON SOMBOON
672115015 NATTAPON SUKKEAW
672115013 NATTHAN CHAMPATHIP
672115016 NATTHAPAT JAGKHURUANG
662115016 NATTHAPHUM CHAIKHAN
672115011 NATTHAPOOM SAENGKAEW
672115014 NATTIKORN SAE-SUE
672115028 NINA BURGER
672115012 NUT SUPAPORN
672115037 PHUTAWAN MUEANGMA
672115042 RANTICHA CHUMJAI
672115041 RAPHEEPHAT AEIPHINGCHAI
672115047 SAMAKOM MAKHIAO
672115046 SATTAPORN KOWARAKUN
622115040 SUCHANUN SIRIJANYA
672115048 SUKRITPONG WONGPANYA
672115024 TAT PUTJORN
672115020 TECHIT WONGKITI
672115019 THINNAPOP SRISOMBOON
672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115045 VIRAWIT KONGTHONG
672115043 WASINPAT YANIN
```
# Sorting by Last Name
```bash
java Main -l class.csv
```
## Example output
```
672115039 METAVEE AEINJANG
672115041 RAPHEEPHAT AEIPHINGCHAI
672115008 CHANYA BUNRUEANG
672115028 NINA BURGER
662115016 NATTHAPHUM CHAIKHAN
672115013 NATTHAN CHAMPATHIP
672115042 RANTICHA CHUMJAI
672115016 NATTHAPAT JAGKHURUANG
672115049 ANAWAT JANDEE
672115007 CHANCHAKORN JULLAPECH
672115004 JITTIPAT KAEWIJIT
662115039 MANAPAT KAEWLAI
672115005 CHETSADA KANKARN
672115001 KATIKA KANTHASON
672115018 DALANPHOP KEAWSIRIPONG
662115007 CHONCHANUN KHACHONPHURITHANAKUL
672115045 VIRAWIT KONGTHONG
672115046 SATTAPORN KOWARAKUN
672115047 SAMAKOM MAKHIAO
672115037 PHUTAWAN MUEANGMA
672115006 CHANLACHAT PANYOYAI
672115009 CHIDNUCHA POBKEEREE
672115024 TAT PUTJORN
672115014 NATTIKORN SAE-SUE
672115011 NATTHAPOOM SAENGKAEW
622115040 SUCHANUN SIRIJANYA
672115010 NATANON SOMBOON
672115019 THINNAPOP SRISOMBOON
672115015 NATTAPON SUKKEAW
672115012 NUT SUPAPORN
672115002 KRITTAMETH TANSUWAN
672115020 TECHIT WONGKITI
672115048 SUKRITPONG WONGPANYA
672115043 WASINPAT YANIN
```
# Searching for "NUT"

```bash
java Main -s class.csv NUT
```
### Example output
```
Element is present at index 15: 672115012 NUT SUPAPORN
```
---
