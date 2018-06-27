def merge_ranges(meetings):

   meeting_times = sorted(meetings)
   merged_range = [meeting_times[0]]

   for start, end in meeting_times[1:]:
       last_start, last_end = merged_range[-1]

       if last_end >= start:
           merged_range[-1] = (last_start, max(last_end, end))
       else:
           merged_range.append((start, end))

   return merged_range


print(merge_ranges([(4, 10), (5, 15)]))