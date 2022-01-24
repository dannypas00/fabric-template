# Fabric Example Mod

## IDEA Setup
 1. Gradle Settings > Build and run using > Set Run tests using to IntelliJ IDEA
 2. File > Project Structure > Project > Set "Project compiler output" to /out director
 3. Rename all template stuff to new mod name:
    - src/com/dannypas00/template:
      - .
      - Template.java  --  MAKE SURE TO DO THIS WITH IDEA REFACTOR
      - ModInfo: MOD_ID
    - resources/assets:
      - template/
      - data:
        - template/
        - fabric.mod.json content
        - template.mixins.json
        - template.mixins.json content
 4. Run genSources gradle task