#include <functional>
#include <iostream>
#include <numeric>
#include <vector>

signed main() {
    std::size_t tcases, num;
    std::cin >> tcases;
    while (tcases--) {
        std::cin >> num;
        
        
        num = 4 * num - 1;
        std::vector<int> vect1(num), vect2(num);
        for (std::size_t i = 0; i < num; ++i)
        
        
            std::cin >> vect1.at(i) >> vect2.at(i);
        std::cout << std::accumulate(vect1.begin(), vect1.end(), 0L, std::bit_xor<int>()) << ' '
                  << std::accumulate(vect2.begin(), vect2.end(), 0L, std::bit_xor<int>()) << '\n';
    }
    return 0;
}
