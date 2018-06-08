#ifndef laboratory2
#define laboratory2

#include <list>
#include <vector>

class Laboratory2{
public:
  int multiply(std::vector<int> &v);
  int multiply(std::list<int> &l);
  Laboratory2();
private:
  std::list<int> l;
  std::vector<int> v;
};

#endif