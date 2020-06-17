BIN=bin
CXXFLAGS=-Ofast
CXX=g++

all: $(BIN)/spatialhashing_times $(BIN)/spatialhashing_memory
$(BIN)/spatialhashing_times: spatialhashing_times.cpp
	$(CXX) $(CXXFLAGS) -o $@ $^

$(BIN)/spatialhashing_memory: spatialhashing_memory.cpp
	$(CXX) $(CXXFLAGS) -o $@ $^

.PHONY: clean
clean:
	rm -rf $(BIN)
