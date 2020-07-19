del /S build\libs\*.jar

gradlew build

if exist build\libs\*.jar (
    for /R build\libs %%f in (*.jar) do copy %%f D:\project\
) else (
    echo "File not found. Compilation failure."
)