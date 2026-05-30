class Solution {

    class SegmentTree {
        int[] tree;

        SegmentTree(int n) {
            tree = new int[4 * n];
        }

        void update(int node, int start, int end, int idx, int val) {

            if (start == end) {
                tree[node] = val;
                return;
            }

            int mid = (start + end) / 2;

            if (idx <= mid) {
                update(2 * node, start, mid, idx, val);
            } else {
                update(2 * node + 1, mid + 1, end, idx, val);
            }

            tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
        }

        int query(int node, int start, int end, int l, int r) {

            if (r < start || end < l) {
                return 0;
            }

            if (l <= start && end <= r) {
                return tree[node];
            }

            int mid = (start + end) / 2;

            return Math.max(
                query(2 * node, start, mid, l, r),
                query(2 * node + 1, mid + 1, end, l, r)
            );
        }
    }

    public List<Boolean> getResults(int[][] queries) {

        int maxX = 0;

        for (int[] q : queries) {
            if (q[0] == 1) {
                maxX = Math.max(maxX, q[1]);
            } else {
                maxX = Math.max(maxX, q[1]);
            }
        }

        SegmentTree seg = new SegmentTree(maxX + 2);

        TreeSet<Integer> set = new TreeSet<>();

        set.add(0);
        set.add(maxX + 1);

        // initially one big segment
        seg.update(1, 0, maxX + 1, maxX + 1, maxX + 1);

        List<Boolean> ans = new ArrayList<>();

        for (int[] q : queries) {

            if (q[0] == 1) {

                int x = q[1];

                Integer right = set.ceiling(x);
                Integer left = set.floor(x);

                // split segment
                seg.update(1, 0, maxX + 1, right, right - x);
                seg.update(1, 0, maxX + 1, x, x - left);

                set.add(x);

            } else {

                int x = q[1];
                int sz = q[2];

                Integer left = set.floor(x);

                int best = seg.query(1, 0, maxX + 1, 0, left);

                boolean possible = best >= sz;

                // last partial segment till x
                possible |= (x - left) >= sz;

                ans.add(possible);
            }
        }

        return ans;
    }
}